import {Component, OnDestroy, OnInit} from '@angular/core';
import {PostsService} from '../posts.service';
import {PostModel} from '../Post';
import {Subscription} from 'rxjs';

@Component({
  selector: 'app-client-search-page',
  templateUrl: './client-search-page.component.html',
  styleUrls: ['./client-search-page.component.scss']
})
export class ClientSearchPageComponent implements OnInit, OnDestroy {
  posts: PostModel[];
  subscription: Subscription;

  constructor(private postsService: PostsService) {
    this.getPosts();
  }

  ngOnInit(): void {
    this.getPosts();
  }

  ngOnDestroy(): void {
    this.subscription.unsubscribe();
  }

  getPosts(): void {
    this.subscription = this.postsService.getPosts()
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

