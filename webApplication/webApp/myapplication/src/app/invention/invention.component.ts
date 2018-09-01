import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-invention',
  templateUrl: './invention.component.html',
  styleUrls: ['./invention.component.css']
})


export class InventionComponent implements OnInit {

  nameModel: String;
  inventorModel: String;
  yearModel: String;
  inventions: Invention[];

  constructor() { 
    this.nameModel = '';
    this.inventorModel = '';
    this.yearModel = '';
    this.inventions = [];
  }

  ngOnInit() {
  }

  createInvention() {
    let newInvention: Invention = {
      name: this.nameModel,
      inventor: this.inventorModel,
      year: this.yearModel
    }
    this.inventions.push(newInvention);
    this.nameModel = this.yearModel = this.inventorModel = '';
  }

}

export class Invention {
  name: String;
  inventor: String;
  year: String;
}