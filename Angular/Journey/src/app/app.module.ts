import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import {DemoService} from "./demo.service";
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { Child2Component } from './child1/child2/child2.component';
import { Parent1Component } from './parent1/parent1.component';
import { Child1aComponent } from './parent1/child1a/child1a.component';
import { Child1Component} from "./child1/child1.component";
import { Unrelated1Component } from './unrelated1/unrelated1.component';
import { Unrelated2Component } from './unrelated2/unrelated2.component';
import {DataServiceService} from "./data-service.service";
import { TerminalComponent } from './terminal/terminal.component';
import {RouterModule} from "@angular/router";
import { ClientPageComponent } from './client-page/client-page.component';

@NgModule({
  declarations: [
    AppComponent,
    Child2Component,
    Parent1Component,
    Child1aComponent,
    Child1Component,
    Unrelated1Component,
    Unrelated2Component,
    TerminalComponent,
    ClientPageComponent
  ],
    imports: [
        BrowserModule,
        BrowserAnimationsModule,
        RouterModule
    ],
  providers: [DemoService, DataServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
