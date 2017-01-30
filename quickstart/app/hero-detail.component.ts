import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Hero } from './hero';
import { ActivatedRoute, Params }   from '@angular/router';
import { Location }                 from '@angular/common';
import 'rxjs/add/operator/switchMap';

import { HeroService } from './hero.service';

@Component({
  moduleId: module.id,
  selector: 'my-hero-detail',
  templateUrl: 'hero-detail.component.html',
  providers: [  ],

  styleUrls: [ 'hero-detail.component.css' ]
})
export class HeroDetailComponent implements OnInit {
    hero: Hero;
    file:File;
    imgOk:boolean;
    constructor(
    private heroService: HeroService,
    private route: ActivatedRoute,
    private location: Location,
    
  ) {}
    
    //@Input() hero: Hero;
   ngOnInit(): void {
    this.route.params
      .switchMap((params: Params) => this.heroService.getHero(+params['id']))
      .subscribe(hero => this.hero = hero);
      this.imgOk=false;
  }
   goBack(): void {
    this.location.back();
  }
  save(img:any): void {
    let file = img.files[0];
    console.log(this.imgOk);
    console.log(file.name);
    if (this.imgOk==true){
     
      this.heroService.saveImg(file,this.hero).then(()=> this.goBack());
      this.hero.img="http://localhost:8080/project/images/"+file.name;
      this.heroService.update(this.hero).then(() => this.goBack());
    }else{
      window.alert("Imagen no valida");
    }
  }
  onChange(event:any, img:any):boolean{
    let file = img.files[0];
        if (!file) {
            return false;
        }
        if ( this.isPng(file) == false ) {
            
            window.alert("No es Png");
            return false;
        }
        if (this.isValidFileSize(file) == false) {
            
           window.alert("Muy Grande");
            return false;
        }
        this.file=file;
        console.log("cumple");
        //this.hero.img="http://localhost:8080/project/images/"+file.name;
        this.imgOk=true;
        return true;
}
isValidFileSize(file:File):boolean {
        let size = file.size/1024;
        console.log(size);
        console.log(size>500);
        return size < 500;
    }

isPng(file:File):boolean {
    if (file.type=="image/png"){
      return true
    }
    
        return false;
}
}
