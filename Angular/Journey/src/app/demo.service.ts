import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DemoService {
  private people: string[] = ["Jakub", "Kamil", "Piotr"];
  constructor() { }

  getPeople(){
    return this.people;
  }
}
