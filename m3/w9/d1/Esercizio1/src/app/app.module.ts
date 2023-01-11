import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { PrimoComponentComponent } from './primo-component/primo-component.component';
import { SecondoComponentComponent } from './secondo-component/secondo-component.component';
import { TerzoComponentComponent } from './terzo-component/terzo-component.component';
import { ProvaComponent } from './components/prova/prova.component';

@NgModule({
  declarations: [
    AppComponent,
    PrimoComponentComponent,
    SecondoComponentComponent,
    TerzoComponentComponent,
    ProvaComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
