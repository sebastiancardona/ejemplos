import { Component, OnInit } from '@angular/core';

import { Hero } from './hero';
import { HeroService } from './hero.service';

@Component({
  moduleId: module.id,
  selector: 'my-dashboard',
  templateUrl: 'dashboard.component.html',
  styleUrls: [ 'dashboard.component.css' ],
})
export class DashboardComponent implements OnInit {

  heroes: Hero[] = [];

  constructor(private heroService: HeroService) { }

  ngOnInit(): void {
    this.heroService.getHeroes()
    //promesa y cuando responde asigna el arreglo 
    //slice parte el arreglo
    //con las llaves hace varias acciones
      .then(heroes => {this.heroes = heroes.slice(1, 5);
      console.log(heroes);
    }).catch((e)=> console.log(e));
  }
}