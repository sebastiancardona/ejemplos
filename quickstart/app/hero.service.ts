import { Injectable } from '@angular/core';
import {Http, Headers, RequestOptions, Response  } from '@angular/http';


import 'rxjs/add/operator/toPromise';

import { Hero } from './hero';


@Injectable()
export class HeroService {
    private heroesUrl = 'http://localhost:8080/Restff/rest/empleado';  // URL to web api
    private headers = new Headers({'Content-Type': 'application/json'});
    private headersFile = new Headers({'Content-Type': 'application/octet-stream'});

    constructor(private http: Http) { }

    getHeroes(): Promise<Hero[]> {
        return this.http.get(this.heroesUrl)
            .toPromise()
            .then(response => response.json() as Hero[])
            .catch(this.handleError);
    }
    getHero(id: number): Promise<Hero> {
        const url = `${this.heroesUrl}/${id}`;
        return this.http.get(url)
            .toPromise()
            .then(response => response.json() as Hero)
            .catch(this.handleError);
    }
    
    update(hero: Hero): Promise<Hero> {
        const url = `${this.heroesUrl}`;
        return this.http
            .put(url, JSON.stringify(hero), {headers: this.headers})
            .toPromise()
            .then(() => hero)
            .catch(this.handleError);
    }
    saveImg(img:File,hero:Hero): Promise<Hero> {
        const url = `${this.heroesUrl}/saveImg`;
        return this.http
            .put(url, img, {headers: this.headersFile})
            .toPromise()
            .then(() => img)
            .catch(this.handleError);
    }

    delete(id: number): Promise<void> {
    const url = `${this.heroesUrl}/delete/${id}`;
    return this.http.get(url)
      .toPromise()
      .then(() => null)
      .catch(this.handleError);
    }
    create(name: string,cargo:string,edad:number): Promise<Hero> {
        
    return this.http
      .post(this.heroesUrl, JSON.stringify({name: name}), {headers: this.headers})
      .toPromise()
      .then(res => res.json().data)
      .catch(this.handleError);
    }


    private handleError(error: any): Promise<any> {
        console.error('An error occurred', error); // for demo purposes only
        return Promise.reject(error.message || error);
    }
    
}
