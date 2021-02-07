import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { RubricaRequest } from './rubrica-request';
import { RubricaResponse } from './rubrica-response';
import { Contatto } from './contatto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  contatti: RubricaResponse[] = [];
  nome: string;
  cognome: string;
  telefono: string;
  ID:number;
  constructor(private http: HttpClient) { }

  inserisci() {
    let rub = new RubricaRequest();
    rub.nome = this.nome;
    rub.cognome = this.cognome;
    rub.telefono = this.telefono;
    rub.ID=this.ID;
    let oss: Observable<RubricaResponse[]>;
    oss = this.http.post<RubricaResponse[]>("http://localhost:8080/rubricagg", rub);
    oss.subscribe(r => this.contatti = r)
  }

}
