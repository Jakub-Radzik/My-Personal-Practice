import {Component, OnInit} from '@angular/core';
import {PostsService} from '../posts.service';
import {PostModel} from "../Post";

@Component({
  selector: 'app-client-search-page',
  templateUrl: './client-search-page.component.html',
  styleUrls: ['./client-search-page.component.scss']
})
export class ClientSearchPageComponent implements OnInit {
  posts: PostModel[];

  constructor(private postsService: PostsService) {
    this.getPosts();
  }

  ngOnInit(): void {
    console.log('INIT');
  }

  getPosts(): void {
    this.postsService.getPosts()
      .subscribe(posts => {
          this.posts = posts;
        },
        error => {
          console.log('Log the error here: ', error);
        });
  }

  log(): void {
    console.log(this.posts);
  }

}

