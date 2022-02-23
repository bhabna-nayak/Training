import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { ProductListComponent } from'./products/product-list.component';
import { ConvertToSpacesPipe } from 'src/app/products/convert-to-spaces.pipe';

import { ChangeColorDirective } from './ChangeColor.directive';

@NgModule({
  imports: [
      SharedModule,
      AppRoutingModule
  ],
  declarations: [
      ChangeColorDirective,
      ProductComponent,
      MyUpperPipe,
      DiscountPipe,
      ProductSearch,
      ProductDetailComponent
  ],

  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }


 

