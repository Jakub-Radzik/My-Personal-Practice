import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ClientPageComponent } from './clients/client-page/client-page.component';
import { CompanyPageComponent } from './company/company-page/company-page.component';
import {PageNotFoundComponent} from './page-not-found/page-not-found.component';
import {AboutPageComponent} from './abouot/about-page/about-page.component';
import {MyGuardGuard} from './Guards/my-guard.guard';

const routes: Routes = [
  {
    path: 'clients/:id',
    component: ClientPageComponent,
    canActivate: [MyGuardGuard]
  },
  {
    path: 'company',
    component: CompanyPageComponent
  },
  {
    path: '',
    redirectTo: '/clients',
    pathMatch: 'full',
  },
  {
    path: 'client',
    redirectTo: '/clients',
    pathMatch: 'full'
  },
  {
    path: 'about',
    component: AboutPageComponent
  },
  {
    path: '**',
    component: PageNotFoundComponent
  }
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
