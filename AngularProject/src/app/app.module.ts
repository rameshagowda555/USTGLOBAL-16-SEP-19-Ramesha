import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';



import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HeaderComponent1 } from './header1/header1.component';
import { HelpComponent } from './help/help.component';
import { LoginComponent } from './login/login.component';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { TwowayBindingComponent } from './data-binding/twoway-binding/twoway-binding.component';
import { DirectivesComponent } from './directives/directives.component';
import { NgIfComponent } from './directives/ng-if/ng-if.component';
import { NgForComponent } from './directives/ng-for/ng-for.component';
import { NgSwitchComponent } from './directives/ng-switch/ng-switch.component';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { FormsComponent } from './forms/forms.component';
import { Form1Component } from './forms/form1/form1.component';
import { Form2Component } from './forms/form2/form2.component';
import { Form3Component } from './forms/form3/form3.component';
import { Form4Component } from './forms/form4/form4.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { DollarPipe } from './dollar.pipe';
import { NewheaderComponent } from './newheader/newheader.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    HeaderComponent1,
    LoginComponent,
    HelpComponent,
    AboutComponent,
    FooterComponent,
    PropertyBindingComponent,
    DataBindingComponent,
    EventBindingComponent,
    TwowayBindingComponent,
    DirectivesComponent,
    NgIfComponent,
    NgForComponent,
    NgSwitchComponent,
    CustomDirective,
    RegisterComponent,
    FormsComponent,
    Form1Component,
    Form2Component,
    Form3Component,
    Form4Component,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailsComponent,
    DollarPipe,
    NewheaderComponent
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : '',component : HomeComponent},
      {path : 'about',component : AboutComponent},
      {path : 'help',component : HelpComponent},
      {path : 'login',component : LoginComponent},
      {path : 'property-binding', component : PropertyBindingComponent},
      {path : 'event-binding',component : EventBindingComponent},
      {path : 'two-way',component :TwowayBindingComponent},
      {path : 'ng-if',component : NgIfComponent},
      {path : 'ng-for',component : NgForComponent},
      {path : 'ng-switch',component : NgSwitchComponent},
      {path : 'register',component : RegisterComponent},
      {path : 'form-1',component : Form1Component},
      {path : 'form-2',component : Form2Component},
      {path : 'form-3',component : Form3Component},
      {path : 'form-4',component : Form4Component},
      {path : 'reactive-form',component : ReactiveFormComponent},
      {path : 'parent',component : ParentComponent},
      {path : 'comment-details',component : CommentDetailsComponent}

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
