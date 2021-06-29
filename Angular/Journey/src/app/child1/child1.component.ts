import {AfterViewInit, Component, Input, OnInit, ViewChild} from '@angular/core';
import {Child2Component} from "./child2/child2.component";

@Component({
  selector: 'app-child1',
  templateUrl: './child1.component.html',
  styleUrls: ['./child1.component.css']
})
export class Child1Component implements OnInit, AfterViewInit {

  @ViewChild(Child2Component) childComponent: { message: string | undefined; } | undefined;
  title: string = "Child1";

  @Input()
  messageForChild: string | undefined;

  message: string | undefined;

  constructor() { }

  ngOnInit(): void {
    console.log("Child1 is live !!!");
  }

  ngAfterViewInit(): void {
    // @ts-ignore
    this.message = this.childComponent.message;
  }

}
