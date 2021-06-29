import {Component, OnChanges, OnInit, SimpleChanges} from '@angular/core';
import {DataServiceService} from "../data-service.service";

@Component({
  selector: 'app-unrelated1',
  templateUrl: './unrelated1.component.html',
  styleUrls: ['./unrelated1.component.css']
})
export class Unrelated1Component implements OnInit, OnChanges{
  message: string | undefined;
  constructor(private data: DataServiceService) { }

  ngOnInit(): void {
    // this.message = this.data.getMessage();
    console.log(this.message);
  }

  ngOnChanges(changes: SimpleChanges): void {
    // this.message = this.data.getMessage();
    console.log(this.message);
  }



}
