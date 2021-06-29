import {Component, OnChanges, OnInit, SimpleChanges} from '@angular/core';
import {DataServiceService} from "../data-service.service";

@Component({
  selector: 'app-unrelated2',
  templateUrl: './unrelated2.component.html',
  styleUrls: ['./unrelated2.component.css']
})
export class Unrelated2Component implements OnInit{
  message: string | undefined;
  constructor(private data: DataServiceService) { }

  ngOnInit(): void {
    // console.log(this.data.getMessage());
  }

  newMessage(){
    // this.data.changeMessage("Changed msg");
  }

}
