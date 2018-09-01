import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculation',
  templateUrl: './calculation.component.html',
  styleUrls: ['./calculation.component.css']
})
export class CalculationComponent implements OnInit {

  sum = 0;
  constructor() { }

  ngOnInit() {
  }

  addition(numberOne:number, numberTwo:number) {
    this.sum = +numberOne + +numberTwo;
  }

}
