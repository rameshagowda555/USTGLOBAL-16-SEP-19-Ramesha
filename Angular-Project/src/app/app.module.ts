import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule} from '@angular/common/http';

import {FormsModule} from '@angular/forms'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { TechElevateComponent } from './tech-elevate/tech-elevate.component';
import { HomeComponent } from './home/home.component';
import { CarsComponent } from './cars/cars.component';
import { ChildcarComponent } from './childcar/childcar.component';
import { BikesComponent } from './bikes/bikes.component';
import { ChildbikesComponent } from './childbikes/childbikes.component';
import { MoviesComponent } from './movies/movies.component';
import { ChildmoviesComponent } from './childmovies/childmovies.component';
import { LaptopsComponent } from './laptops/laptops.component';
import { ChildlaptopsComponent } from './childlaptops/childlaptops.component';
import { MobilesComponent } from './mobiles/mobiles.component';
import { ChildmobilesComponent } from './childmobiles/childmobiles.component';
import { NewheaderComponent } from './newheader/newheader.component';
import { NewhomeComponent } from './newhome/newhome.component';
import { CountriesComponent } from './countries/countries.component';
import { CategoriesComponent } from './categories/categories.component';
import { SourcesComponent } from './sources/sources.component';
import { SearchnewsComponent } from './searchnews/searchnews.component';
import { MovieheaderComponent } from './movieheader/movieheader.component';
import { NewmoviesComponent } from './newmovies/newmovies.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
   // RouterModule,
    TechElevateComponent,
   HomeComponent,
   CarsComponent,
   ChildcarComponent,
   BikesComponent,
   ChildbikesComponent,
   MoviesComponent,
   ChildmoviesComponent,
   LaptopsComponent,
   ChildlaptopsComponent,
   MobilesComponent,
   ChildmobilesComponent,
   NewheaderComponent,
   NewhomeComponent,
   CountriesComponent,
   CategoriesComponent,
   SourcesComponent,
   SearchnewsComponent,
   MovieheaderComponent,
   NewmoviesComponent
  ],
  imports: [
    BrowserModule,
   // AppRoutingModule,
   HttpClientModule,
    RouterModule.forRoot([
      {path : 'tech-elevate',component : TechElevateComponent},
      {path : 'home',component : HomeComponent},
      {path : 'cars',component : CarsComponent},
      {path : 'bikes',component : BikesComponent},
      {path : 'movies',component : MoviesComponent},
      {path : 'laptops',component : LaptopsComponent},
      {path : 'mobiles',component : MobilesComponent},
      {path : 'newhome',component : NewhomeComponent},
      {path : 'countrie',component : CountriesComponent},
      {path : 'categorie',component : CategoriesComponent},
      {path : 'source',component : SourcesComponent},
      {path : 'search',component: SearchnewsComponent},
      {path : 'newmovies',component : NewmoviesComponent}
      
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
