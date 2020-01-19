import { Injectable } from "@angular/core";
import { CanActivate, ActivatedRouteSnapshot } from '@angular/router';

@Injectable({
    providedIn: 'root'
})

export class AuthGuard implements CanActivate {
    canActivate(route: ActivatedRouteSnapshot): boolean {
        console.log('can activate is running');
        console.log(route.data.name);
        return false;
    }
 }