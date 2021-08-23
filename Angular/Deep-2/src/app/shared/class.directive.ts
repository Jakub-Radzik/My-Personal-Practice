import {Directive, ElementRef, Input} from '@angular/core';

@Directive({
  selector: '[appClass]'
})
export class ClassDirective {

  constructor(private element: ElementRef) {
  }

  @Input('appClass') set classnames(classObject: any) {
    for (const key in classObject) {
      if (classObject[key]){
        this.element.nativeElement.classList.add(key);
      }else{
        this.element.nativeElement.classList.remove(key);
      }
    }
    console.dir(this.element.nativeElement.classList);
    // this.element.nativeElement.classList.add(className);
  }

}
