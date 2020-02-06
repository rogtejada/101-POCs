
FROM node:alpine

LABEL manteiner.name="Rodrigo Tejada"
LABEL manteiner.email="rodrigo.g.tejada@gmail.com"

RUN apk add --update --no-cache chromium

WORKDIR /var/www/app

RUN npm install -g @angular/cli

EXPOSE 4200 49153

COPY . /var/www/app

CMD [ "npm", "install" ]
