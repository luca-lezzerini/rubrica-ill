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
  ID: number;
  stato = "";
  stato2 = "prova";
  constructor(private http: HttpClient) { }

  inserisci() {
    this.stato = "";
    this.stato2 = "prova";
    let rub = new RubricaRequest();
    rub.nome = this.nome;
    rub.cognome = this.cognome;
    rub.telefono = this.telefono;
    rub.ID = this.ID;
    let oss: Observable<RubricaResponse[]>;
    oss = this.http.post<RubricaResponse[]>("http://localhost:8080/rubricagg", rub);
    oss.subscribe(r => this.contatti = r)
  }

  svuota() {
    let rub = new RubricaRequest();
    rub.nome = this.nome;
    rub.cognome = this.cognome;
    rub.telefono = this.telefono;
    rub.ID = this.ID;
    let oss: Observable<RubricaResponse[]>;
    oss = this.http.post<RubricaResponse[]>("http://localhost:8080/rubricasvu", rub);
    oss.subscribe(r => this.contatti = r)
  }

  ritorna() {
    this.stato = "lista";
    this.stato2 = "1";
    let rub = new RubricaRequest();
    rub.nome = this.nome;
    rub.cognome = this.cognome;
    rub.telefono = this.telefono;
    rub.ID = this.ID;
    let oss: Observable<RubricaResponse[]>;
    oss = this.http.post<RubricaResponse[]>("http://localhost:8080/rubricalis", rub);
    oss.subscribe(r => this.contatti = r)
  }

  oscuraLista() {
    this.stato2 = "prova";
    this.stato = "2";
  }

  // cancellaID() {
  //   this.stato = "cancellazione";
  //   this.stato2 = "cancellazione";

  // }

  // indietro() {
  //   this.stato = "";
  //   this.stato2 = "prova";
  // }

}
