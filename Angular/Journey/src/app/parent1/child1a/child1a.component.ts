import {Component, OnInit, EventEmitter, Output} from '@angular/core';

@Component({
  selector: 'app-child1a',
  templateUrl: './child1a.component.html',
  styleUrls: ['./child1a.component.css']
})
export class Child1aComponent implements OnInit {

  constructor() { }

  message: string = "SIEMA";

  @Output()
  messageEvent = new EventEmitter <string>();

  ngOnInit(): void {
  }

  sendMessage() {
    this.messageEvent.emit(this.message);
  }

}
