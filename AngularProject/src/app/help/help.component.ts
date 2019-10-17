import { Component } from '@angular/core';


@Component ({
    selector : 'app-help',
    templateUrl : './help.component.html',
    styleUrls : ['./help.component.css']
})




export class HelpComponent {
    colorName = 'blue';
    color = 'green';
    isActive = false;
    constructor() {
        setInterval(()=> {
        this.isActive = true;
    },2000)
    }
}