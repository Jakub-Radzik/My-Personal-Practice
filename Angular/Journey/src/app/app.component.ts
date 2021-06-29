import {Component, OnInit} from '@angular/core';
import {DemoService} from "./demo.service";

@Component({
  selector: 'my-app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})
export class AppComponent implements OnInit{
  title:string = 'AngularJourney';
  messageForChild: string = "Tidy your room";

  constructor(public demoService: DemoService) {}

  ngOnInit(): void {
    this.demoService.getPeople().forEach(el=>console.log(el));
  }
}
