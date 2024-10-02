# 🌸 PainCare - Application de Suivi pour l'Endométriose

**PainCare** est une application web de gestion et de suivi des symptômes pour les personnes atteintes d'endométriose. Elle permet aux utilisateurs de suivre leurs douleurs, symptômes et traitements, d'obtenir des conseils médicaux, et de mieux comprendre et gérer leur maladie au quotidien.

## 🎯 Objectif du Projet

L'objectif de **PainCare** est d'offrir une plateforme accessible pour améliorer la qualité de vie des patients atteints d'endométriose. L'application permet un suivi régulier des symptômes, un journal de la douleur, et des recommandations adaptées.

## 🚀 Fonctionnalités

- 📅 **Suivi des symptômes** : Permet aux utilisateurs de consigner les douleurs, leur intensité, et d'autres symptômes spécifiques liés à l'endométriose.
- 💊 **Gestion des traitements** : Suivi des traitements prescrits, notifications pour les prises de médicaments, et mise à jour du plan de traitement.
- 📝 **Journal de la douleur** : Les utilisateurs peuvent noter la douleur qu'ils ressentent au quotidien et visualiser des graphiques d'évolution.
- 📈 **Rapports et statistiques** : Visualisation des données de suivi pour permettre une meilleure compréhension des symptômes au fil du temps.
- 🧑‍⚕️ **Recommandations médicales** : Accès à des conseils et informations validées par des professionnels de santé pour mieux gérer la maladie.
- 🔔 **Notifications** : Alertes pour rappeler les prises de médicaments ou des événements liés aux rendez-vous médicaux.

## 🛠️ Technologies Utilisées

- **Backend** : Spring Boot 🌱
- **Frontend** : React ⚛️
- **Base de données** : PostgreSQL 🐘
- **API de notifications** : Twilio (pour les SMS et notifications par email)
- **Sécurité** : JWT (JSON Web Tokens) pour l'authentification sécurisée 🔐
- **Déploiement** : Docker 🐳 et Kubernetes 🚀 

## 📂 Structure du Projet

```bash
paincare/
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/paincare/
│   │   │   ├── resources/
│   └── pom.xml
├── frontend/
│   ├── src/
│   │   ├── components/
│   │   ├── services/
│   └── package.json
├── docker-compose.yml
└── README.md

