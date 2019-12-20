import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { ContactusComponent } from './contactus/contactus.component';
import { ShowAllProductsComponent } from './show-all-products/show-all-products.component';
import { AddProductComponent } from './add-product/add-product.component';
import { SearchbycategoryComponent } from './searchbycategory/searchbycategory.component';
import { SearchbycompanyComponent } from './searchbycompany/searchbycompany.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    ContactusComponent,
    ShowAllProductsComponent,
    AddProductComponent,
    SearchbycategoryComponent,
    SearchbycompanyComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
