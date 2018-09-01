import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { GreetingComponent } from './greeting/greeting.component';
import { CalculationComponent } from './calculation/calculation.component';
import { InventionComponent } from './invention/invention.component';
import { PipeExampleComponent } from './pipe-example/pipe-example.component';
import { ReverseStr } from './pipe-example/reverseStr';

@NgModule({
  declarations: [
    AppComponent,
    GreetingComponent,
    CalculationComponent,
    InventionComponent,
    PipeExampleComponent,
    ReverseStr
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
