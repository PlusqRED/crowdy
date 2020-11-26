import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {ProjectListComponent} from './project-list/project-list.component';
import {ProjectItemComponent} from './project-item/project-item.component';
import {ProjectDetailsComponent} from './project-details/project-details.component';
import {MaterialModule} from "../../material/material.module";
import {ProjectService} from "../../services/project.service";
import {ProjectLikeTooltipComponent} from './project-like-tooltip/project-like-tooltip.component';


@NgModule({
  declarations: [ProjectListComponent, ProjectItemComponent, ProjectDetailsComponent, ProjectLikeTooltipComponent],
  exports: [
    ProjectItemComponent
  ],
  imports: [
    CommonModule,
    MaterialModule
  ],
  providers: [
    ProjectService
  ]
})
export class ProjectModule {
}