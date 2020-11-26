import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {Route, RouterModule} from "@angular/router";
import {ProjectListComponent} from "../components/project/project-list/project-list.component";
import {LoginComponent} from "../components/login/login.component";

const routes: Route[] = [
  {
    path: '', component: ProjectListComponent, pathMatch: 'full'
  },
  {
    path: 'login', component: LoginComponent
  },
  /*{path: 'recipes', component: RecipesComponent, children: [
      {path: 'new', component: RecipeEditComponent},
      {path: ':id', component: RecipeDetailComponent},
      {path: ':id/edit', component: RecipeEditComponent}
    ]},
  {path: 'shopping-list', component: ShoppingListComponent}*/
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule, RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ]
})
export class RouteModule {
}
