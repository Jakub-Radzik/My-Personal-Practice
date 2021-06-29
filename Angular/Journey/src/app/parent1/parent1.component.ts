import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent1',
  templateUrl: './parent1.component.html',
  styleUrls: ['./parent1.component.css']
})
export class Parent1Component implements OnInit {

  constructor() { }
  public items: string[] = ["jedn", "dwa", "erwrw"];

  public persons: Person[] = [new Person("Jakub", 20), new Person("Andrzej", 22), new Person("Piotr", 24), new Person("Jakub", 20)]

  ngOnInit(): void {
  }

  message: string | undefined;

  receiveMessageFromChild($event: string) {
    this.message = $event;
    console.log(this.message);
  }
}

class Person{
  private _name: string;
  private _age: number;


  constructor(name: string, age: number) {
    this._name = name;
    this._age = age;
  }


  get name(): string {
    return this._name;
  }

  set name(value: string) {
    this._name = value;
  }

  get age(): number {
    return this._age;
  }

  set age(value: number) {
    this._age = value;
  }
}
