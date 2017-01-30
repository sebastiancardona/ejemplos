import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Hero } from './hero';
import { ActivatedRoute, Params } from '@angular/router';
import { Location } from '@angular/common';
import 'rxjs/add/operator/switchMap';

import { HeroService } from './hero.service';

@Component({
    moduleId: module.id,
    selector: 'my-new-detail',
    templateUrl: 'hero-new.component.html',
    styleUrls: ['hero-new.component.css']
})
export class HeroNewComponent implements OnInit {
    
    hero={id: 1, name: '',cargo:'',edad:0,img:"images/defaultImg.png"}
    id: number;
    constructor(
        private heroService: HeroService,
        private route: ActivatedRoute,
        private location: Location

    ) { }

    //@Input() hero: Hero;
    ngOnInit(): void {
       
        let id2: number = 0;
        this.route.params.forEach((param) => id2 = parseInt(param["id"],10));
        this.id=id2+1;
        console.log(id2);
        console.log(this.id);
        this.hero.id+=id2;

    }
    goBack(): void {
        this.location.back();
    }
    save(): void {
        
        this.heroService.update(this.hero)
            .then(() => this.goBack());
    }
}