# Reflection: Balancing Stakeholder Needs

## 1. Challenges in Addressing Stakeholder Requirements

### 1.1 Conflicting Priorities
Different stakeholders had conflicting priorities. For example:
- **Students** wanted instant notifications and real-time attendance tracking.
- **IT Staff** were concerned about system bandwidth and performance.
- **University Management** prioritized budget constraints and long-term maintainability.

**Solution:** The system was designed with optimized notification handling to reduce server load while ensuring real-time updates.

### 1.2 Scalability vs. Performance
- **IT Staff** needed the system to handle high user loads.
- **Lecturers** required instant report generation without delays.
- **Administrators** wanted secure and encrypted data storage.

**Solution:** We used PostgreSQL for efficient query handling and designed the backend with scalable cloud infrastructure.

### 1.3 Security vs. Usability
- **Security teams** insisted on strict authentication (multi-factor authentication, AES-256 encryption).
- **Students & Lecturers** preferred a simple login experience.

**Solution:** We implemented OAuth 2.0 with multi-factor authentication as an optional setting to balance security and ease of access.

## 2. Key Takeaways
- **Trade-offs are necessary:** Not all stakeholder concerns can be fully met without compromises.
- **User experience matters:** Balancing security with usability ensures better adoption.
- **Scalability planning is critical:** Designing a system for future growth avoids performance bottlenecks later.

