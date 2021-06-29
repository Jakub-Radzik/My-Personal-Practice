import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-search-form',
  templateUrl: './search-form.component.html',
  styleUrls: ['./search-form.component.sass']
})
export class SearchFormComponent implements OnInit {
  searchField: string | undefined;

  constructor() { }

  ngOnInit(): void {

  }

  onSubmit() {
    console.log(this.searchField);
  }
}
