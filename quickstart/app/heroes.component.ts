import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Hero } from './hero';
import { HeroService } from './hero.service';

@Component({
  moduleId: module.id,
  selector: 'my-heroes',
  templateUrl:'heroes.component.html',
  styleUrls: ['heroes.component.css'],
  providers: [HeroService]
})
export class HeroesComponent implements OnInit {
  title = 'Lista de empleados';
  heroes: Hero[];
  selectedHero: Hero;
  id2: number;

  constructor(private heroService: HeroService,
              private router: Router,) { }

  getHeroes(): void {
    this.heroService.getHeroes().then((heroes) => {
      this.heroes = heroes;
      console.log(heroes);
    }).catch((e)=> console.log(e));
  }

  ngOnInit(): void {
    this.getHeroes();
  }

  onSelect(hero: Hero): void {
    
    this.id2=hero.id;
    console.log(this.id2);

    this.heroService.getHero(this.id2).then((hero)=>{
   
      this.selectedHero = hero;
      console.log(hero);
    }).catch((e)=> console.log(e));
    
  }
  gotoDetail(): void {
  this.router.navigate(['/detail', 
  this.selectedHero.id]);
}
   
    
}