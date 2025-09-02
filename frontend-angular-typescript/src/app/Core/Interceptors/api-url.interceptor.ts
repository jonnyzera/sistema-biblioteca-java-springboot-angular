import { Injectable } from '@angular/core';
import { HttpEvent, HttpHandler, HttpInterceptor, HttpRequest } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../../../environments/environment';

@Injectable()
export class ApiUrlInterceptor implements HttpInterceptor {
    intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
        if (!req.url.startsWith('http')) {
            const apiUrl = environment.apiUrl;
            const apiReq = req.clone({ url: `${apiUrl}${req.url}` });
            return next.handle(apiReq);
        }
        return next.handle(req);
    }
}