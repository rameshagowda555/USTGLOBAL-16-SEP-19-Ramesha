import { ElementRef, Directive, HostBinding, HostListener } from '@angular/core';

@Directive({
    selector : '[custDir]'
})




export class CustomDirective {
    constructor(public el : ElementRef){
        this.el.nativeElement.style.backgroundColor ='blue';
    }
    @HostBinding('style.color')color = 'white';
    @HostBinding('style.backgroundColor') background = 'blue';
   
    @HostListener('mouseenter')m(){
        this.el.nativeElement.style.backgroundColor='green';
    }
    @HostListener('mouseleave')n(){
        this.el.nativeElement.style.backgroundColor = 'yellow';
    }
}