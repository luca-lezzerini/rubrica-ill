import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Contatto } from './contatto';
import { RubricaRequest } from './rubrica-request';
import { RubricaResponse } from './rubrica-response';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  stato: string = "";
  contatto = new Contatto();
  contatti: Contatto[] = [];
  error: string;
  criterio = "";

  constructor(private http: HttpClient) { }

  rubricaAgg() {
    if (this.contatto.nome != null && this.contatto.cognome != null && this.contatto.telefono != null) {
      this.stato = "";
      let req = new RubricaRequest();
      req.contatto = this.contatto;
      let ox: Observable<RubricaResponse> = this.http
        .post<RubricaResponse>("http://localhost:8080/rubricagg",
          req);
      ox.subscribe(r => {
        this.contatti = r.listaContatti;
      });
      this.contatto = new Contatto();
    }
    else {
      this.stato = "errore";
      this.error = "Tutti i campi sono obbligatori";
    }
  }

  rubricaLista() {
    let oss = this.http.get<RubricaResponse>("http://localhost:8080/rubricalis");
    oss.subscribe(r => this.contatti = r.listaContatti);
  }

  rubricaSvuota() {
    let oss = this.http.get<RubricaResponse>("http://localhost:8080/rubricasvu");
    oss.subscribe(r => this.contatti = r.listaContatti);
  }

  eliminaPerId(c: Contatto) {
    let req = new RubricaRequest();
    req.contatto = c;
    let oss = this.http.post<RubricaResponse>("http://localhost:8080/rubricarem", req);
    oss.subscribe(r => {
      this.contatti = r.listaContatti;
    });
  }

  cerca() {
    let req = new RubricaRequest();
    req.contatto = new Contatto();
    req.contatto.nome = this.criterio;
    let oss = this.http.post<RubricaResponse>
      ("http://localhost:8080/cerca-string", req);
    oss.subscribe(r => {
      this.contatti = r.listaContatti;
    });
  }

}
