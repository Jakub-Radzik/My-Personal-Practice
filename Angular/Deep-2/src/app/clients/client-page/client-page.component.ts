import {Component, OnInit} from '@angular/core';
import {ClientService} from '../client.service';
import {Client} from '../client';

@Component({
  selector: 'app-client-page',
  templateUrl: './client-page.component.html',
  styleUrls: ['./client-page.component.scss'],
  providers: [ClientService]
})
export class ClientPageComponent implements OnInit {
  clientList: any[];

  constructor(private clientService: ClientService) {
  }

  ngOnInit(): void {
    console.log('Component just started');
  }

  saveClient(clientDetails: Client): void {
    console.log(clientDetails);
    this.clientService.save(clientDetails);
  }

}
