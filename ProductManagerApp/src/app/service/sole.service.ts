import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Sole } from '../class/sole';

@Injectable({
  providedIn: 'root',
})
export class SoleService {
  private soleAPI = 'http://localhost:8080/api/soles';

  constructor(private httpClient: HttpClient) {}

  getListSole(): Observable<Sole[]> {
    return this.httpClient.get<Sole[]>(`${this.soleAPI}`);
  }
}
