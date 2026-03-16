# Usage & Billing System for Shared Resources

## Overview
This project implements a **Usage and Billing System** for shared resources such as meeting rooms, gym equipment, or workstations.

Each resource has a **limited capacity**, meaning only a fixed number of users can use it simultaneously.  
The system tracks usage time and calculates billing based on predefined pricing rules.

The project contains:

- **Backend logic implemented in Java**
- **A lightweight UI implemented using HTML, CSS, and JavaScript** to demonstrate the workflow.

---

## Features

- Add a resource with capacity and pricing rules
- Start using a resource
- Stop usage
- Track usage duration
- Calculate billing automatically
- Prevent resource usage when capacity is full
- Simple web-based UI to demonstrate the system

## System Design

### Resource
Represents a shared facility.

Attributes:
- Resource ID
- Capacity
- Current users
- First hour cost
- Additional hour cost

---

### Usage Session
Tracks a user's usage of a resource.

Attributes:
- User ID
- Resource ID
- Start time
- End time

---

### Billing Logic
Billing is calculated based on the following rules:

- The first hour has a fixed cost
- Each additional hour has a separate cost
- If usage exceeds a full hour, it is rounded up to the next hour

Example:

Start Time: 10:00 AM  
Stop Time: 11:20 AM  

Total Duration: 1 hour 20 minutes  
Rounded Duration: 2 hours

Billing:

First Hour = ₹30  
Additional Hour = ₹10  

Total Bill = ₹40

## How the System Works

1. A resource is created with capacity and pricing.
2. A user requests to start using the resource.
3. The system checks if capacity is available.
4. If available, the system records the start time.
5. When the user stops usage, the system:
   - calculates total duration
   - applies pricing rules
   - generates the final bill
6. The resource slot becomes available again.

---

## Project Structure
BillingService.java → Handles resource management and billing
Resource.java → Resource data model
UsageSession.java → Tracks user sessions
Main.java → Java program entry point
index.html → Simple UI to demonstrate system flow

## Running the Java Backend

Compile the code:

javac *.java

Run the program:

java Main

## Running the UI

Open the file:

index.html
in any web browser.

The UI allows you to:

- Add resources
- Start usage
- Stop usage
- View billing results