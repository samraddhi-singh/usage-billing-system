# Usage & Billing System

This project implements a simple system to manage shared resources and generate billing based on usage duration.

## Features
- Add resource with capacity
- Start usage
- Stop usage
- Prevent over capacity
- Calculate billing

## Billing Logic
First hour cost + additional hour cost.
Usage is rounded up to next hour.

## How to Run

Compile:
javac *.java

Run:
java Main