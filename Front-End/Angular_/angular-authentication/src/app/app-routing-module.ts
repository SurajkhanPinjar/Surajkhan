
import { NgModule } from '@angular/core';
import { RouterModule, Route } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { AboutComponent } from './about/about.component';
import { AdminComponent } from './admin/admin.component';
import { AuthGuard } from './header/auth.guard';
import { UserComponent } from './user/user.component';
import { LogoutComponent } from './logout/logout.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';



let routes : Route[] =  [
        { path: '' , component: HomeComponent },
        { path: 'login', component: LoginComponent},
        { path: 'register', component: RegisterComponent},
        { path: 'about', component: AboutComponent},
        { path: 'admin', component: AdminComponent,
        canActivate: [AuthGuard],
        data: { expectedRoles: ['admin'] } },
        { path: 'user', component: UserComponent, 
                canActivate: [AuthGuard],
                data: {expectedRoles: ['admin', 'user']}
        },
        { path: 'logout', component: LogoutComponent},
        { path: '**' , component: PageNotFoundComponent}
  
      
]


@NgModule ({
    imports: [
        RouterModule.forRoot(routes),
        
    ],
    exports: [
        RouterModule
    ]
})

export class AppRoutingModule {

}