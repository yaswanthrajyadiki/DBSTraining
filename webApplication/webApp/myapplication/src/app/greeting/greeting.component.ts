import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-greeting',
  templateUrl: './greeting.component.html',
  styleUrls: ['./greeting.component.css']
})
export class GreetingComponent implements OnInit {

  names = ["pappu", "chintu", "banti"]
  persons = [{"name":"ramu", "qualities": ["good", "clean"]}, 
  {"name":"sita", "qualities": ["good", "clean"]}, {"name":"laxman", "qualities": ["good", "clean"]}]
  message = 'Greeting you ';
  constructor() { }

  ngOnInit() {
  }
  addUsername(username) {
    this.names.push(username);
  }
}
