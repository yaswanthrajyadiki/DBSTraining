import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  // template: `
  //   <p> This is HTML template inside component file </p> 
  //   <app-greeting></app-greeting>
  // `,
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'myapplication';
  message= 'WELCOME TO MY APPLICATION';
}
