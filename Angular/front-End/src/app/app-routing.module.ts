import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CUstomerComponent } from './customer/customer.component';
import { DashBoardComponent } from './dash-board/dash-board.component';

const routes: Routes = [
  {path:"",component:DashBoardComponent},
  {path:"customer",component:CUstomerComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
