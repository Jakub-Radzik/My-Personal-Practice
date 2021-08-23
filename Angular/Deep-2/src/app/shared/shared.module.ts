import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SearchFormComponent } from '../search/search-form/search-form.component';
import { FormsModule } from '@angular/forms';
import { CustomMaterialModule } from '../custom-material.module';
import {ClassDirective} from './class.directive';
import { LoopDirective } from './loop.directive';

@NgModule({
  declarations: [SearchFormComponent, ClassDirective, LoopDirective],
  imports: [CommonModule, FormsModule, CustomMaterialModule],
  exports: [SearchFormComponent, ClassDirective, LoopDirective],
})
export class SharedModule {}
