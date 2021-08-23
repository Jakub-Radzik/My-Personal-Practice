import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AboutPageComponent } from './about-page/about-page.component';
import { CustomMaterialModule } from '../custom-material.module';
import {SharedModule} from '../shared/shared.module';

@NgModule({
  declarations: [AboutPageComponent],
  imports: [
    CommonModule,
    CustomMaterialModule,
    SharedModule,
  ]
})

export class AboutModule { }
