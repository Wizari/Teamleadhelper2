import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {FormControl} from "@angular/forms";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.less']
})
export class AppComponent implements  OnInit{
  title = 'team-lead-helper';

  _projects: Project[];
  formControl = new FormControl('');

  ngOnInit(): void {
    this.http.get<Project[]>("http://localhost:8080/api/projects/list")
      .subscribe(value => this._projects = value)
  }


  constructor(private http: HttpClient) {
  }


  onClickAction() {
    this.http.post("http://localhost:8080/api/projects", {
      name: "testAng",
      code: "Code11"
    }).subscribe(value => console.log(value))
    // }).subscribe(value => this._projects.concat(new Project(value.name, value.code )))
    // }).subscribe(value => this._projects.concat(new Project(value.name, value.code, value,id)))
  }

  onDeleteAction(id: number) {
    this.http.delete(`http://localhost:8080/api/projects/${id}`)
      .subscribe(() => this._projects.filter(value => value.id != id));
  }

}
