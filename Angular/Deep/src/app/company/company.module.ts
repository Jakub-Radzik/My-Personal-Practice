import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {SharedModule} from '../shared/shared.module';
import { CompanyPageComponent } from './company-page/company-page.component';
@NgModule({
  imports: [CommonModule, SharedModule],
  declarations: [CompanyPageComponent],
})
export class CompanyModule {}
