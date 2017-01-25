import { Injectable } from '@angular/core';
import { Headers, Http } from '@angular/http';
import { Response } from '@angular/http'
import 'rxjs/add/operator/toPromise';
import { Hero } from './hero';
import { HEROES } from './mock-heroes';

@Injectable()
export class HeroService {
    private heroesUrl = 'http://localhost:8080/Restff/rest/empleado';  // URL to web api

    constructor(private http: Http) { }
    getHeroes(): Promise<Hero[]> {
        return this.http.get(this.heroesUrl)
            .toPromise()
            .then(response => response.json() as Hero[])
            .catch(this.handleError);
    }

    // See the "Take it slow" appendix
    
    getHero(id: number): Promise<Hero> {
        const url = `${this.heroesUrl}/buscar?name=${id}`;
        return this.http.get(url)
            .toPromise()
            .then(response => response.json() as Hero)
            .catch(this.handleError);
    }
    private handleError(error: any): Promise<any> {
        console.error('An error occurred', error); // for demo purposes only
        return Promise.reject(error.message || error);
    }
}
