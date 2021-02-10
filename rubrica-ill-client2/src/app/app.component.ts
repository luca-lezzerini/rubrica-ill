import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { RubricaRequest } from './rubrica-request';
import { RubricaResponse } from './rubrica-response';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  contatto: RubricaRequest = new RubricaRequest();
  rubrica: RubricaRequest[] = [];
  indice: number;


  constructor(private http: HttpClient) { }

  rubricaAgg() {

    let ox: Observable<RubricaResponse> = this.http
      .post<RubricaResponse>("http://localhost:8080/rubricagg",
        this.contatto);
    ox.subscribe(r => {
      this.rubrica = r.contatto;
      this.contatto = new RubricaRequest;
    });
  }

  rubricaLista() {
    let oss = this.http.get<RubricaResponse>("http://localhost:8080/rubricalis");
    oss.subscribe(r => this.rubrica = r.contatto);
  }

  rubricaSvuota() {
    let oss = this.http.get<RubricaResponse>("http://localhost:8080/rubricasvu");
    oss.subscribe(r => this.rubrica = r.contatto);
  }

  elimina(i: number) {
    this.indice = i;
    let oss = this.http.post<RubricaResponse>("http://localhost:8080/rubricarem", this.rubrica[this.indice]);
    oss.subscribe(r => {
      this.rubrica = r.contatto;
      this.contatto = new RubricaRequest;
    });
  }
}
