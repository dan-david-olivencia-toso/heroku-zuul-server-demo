# heroku-zuul-server-demo

Microservicio de API Gateway. Fork del proyecto [Zuul Server Demo](https://github.com/kissaten/heroku-zuul-server-demo) desarrollado originalmente por la organización [kissaten](https://github.com/kissaten)

Utilizado como parte del Trabajo Final de Laboratorio de la asignatura Desarrollo de Aplicaciones en la Nube - UTN FRSF 2021

![image](https://user-images.githubusercontent.com/32349705/131783530-ceb6d9c4-d874-4529-8350-ab254cdbb477.png)

------

This project demonstrates the use of Netflix OSS with Spring Cloud on Heroku. It defines a Zuul server
that proxies request to backing services run at httpbin.org.

### Quickstart

[![Deploy to Heroku](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)

### Local development

```
$ git clone https://github.com/kissaten/heroku-zuul-server-demo
$ cd heroku-zuul-server-demo
$ heroku create
$ git push heroku master
$ heroku open index.html
```

### License

MIT
