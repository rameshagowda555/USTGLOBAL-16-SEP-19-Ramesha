import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HeaderComponent } from './header/header.component';
import { AuthGuard } from './auth.guard';
import { StudentComponent } from './student/student.component';


const routes: Routes = [
  {
    path: '', component: HomeComponent
  },
  {
    path: 'admin', component: AdminComponent,
    canActivate: [AuthGuard], data: { userType: ['Admin'] }
  },
  {
    path: 'login', component: LoginComponent
  },
  {
    path: 'student', component: StudentComponent,
    canActivate: [AuthGuard], data: { userType: ['Admin', 'Student'] }
  },
  {
    path: 'register', component: RegisterComponent
  },
  {
    path: 'header', component: HeaderComponent
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
