# Crop-Recommendation-System

## Overview

The Crop Recommendation System is a machine-learning-powered solution designed to assist farmers, particularly in India, in making informed decisions about the most suitable crops to grow based on their soil and environmental conditions. By leveraging advanced algorithms and integrating them with accessible technology, the system aims to enhance agricultural productivity and sustainability.

## Features

Machine Learning-Based Recommendations: Utilizes a Random Forest Classifier with an accuracy of 99.18% to predict the optimal crops.

Cloud-Based API: Provides scalability and accessibility, enabling farmers to receive recommendations remotely.

User-Friendly Android App: Built using Android Studio and Java, the app serves as an intuitive interface for farmers to input soil parameters and receive recommendations instantly.

## Key Contributions

Data Analysis and Feature Engineering: Identifies key parameters like nitrogen, phosphorus, potassium, temperature, pH, and precipitation for accurate predictions.

Robust Model Implementation: The Random Forest Classifier effectively handles agricultural data complexities, mitigating overfitting and providing reliable predictions.

Integrated Android App: Bridges the gap between advanced technology and practical usability for farmers in remote locations.

## Technologies Used

Programming Languages: Python, Java

Frameworks: TensorFlow, Flask (for API deployment)

Tools: Android Studio

Machine Learning Model: Random Forest Classifier

Database: Agricultural datasets comprising soil and environmental parameters

## System Workflow

Data Collection: Soil and climate parameters are gathered and preprocessed.

Model Training and Deployment:
Train the Random Forest Classifier using preprocessed data.

Deploy the model as a Flask API on the cloud.

Mobile Integration: The Android app interacts with the API to provide real-time crop recommendations.

## How It Works

Input: Farmers input soil and environmental details (e.g., nitrogen, pH, precipitation) via the Android app.

Processing: The app sends data to the cloud-based API.

Output: The API responds with crop recommendations based on the trained machine learning model.

## Getting Started

Prerequisites

Python 3.x
Android Studio
Flask
Required Python libraries: pandas, scikit-learn, Flask, etc.

Installation

Clone this repository.
Install the necessary Python dependencies using pip install -r requirements.txt.
Run the Flask API locally: python api.py.
Launch the Android app in Android Studio.

## Contributions

This project was developed as a step toward revolutionizing agriculture by providing farmers with actionable insights and personalized recommendations. It strives to merge cutting-edge technology with grassroots-level usability, ensuring farmers can make informed decisions to maximize productivity.

