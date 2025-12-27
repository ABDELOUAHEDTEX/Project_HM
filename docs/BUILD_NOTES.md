# Build Notes

## EMF Code Regeneration

After updating `model/metamodel.ecore`, you must regenerate the Java model code:

### Using Eclipse

1. Open Eclipse with EMF plugins installed
2. Import the project
3. Open `model/metamodel.genmodel`
4. Right-click → Generate Model Code
5. Refresh the project

### Using Command Line (if EMF tools available)

```bash
# This requires EMF code generation tools
# Typically done through Eclipse IDE
```

### Current Status

The metamodel (`model/metamodel.ecore`) has been updated with:
- All required EClasses (ContainerService, Function, DatabaseInstance, etc.)
- Missing relationships (ComputeInstance->Subnet, AutoScalingGroup->template)
- Missing attributes (Infrastructure.provider, Subnet.typeSubnet)
- Constraints (lowerBound=1 for required references)

**Action Required**: Regenerate Java code from the updated metamodel using Eclipse EMF tools.

## Maven Build

The project uses Maven for dependency management and compilation.

### Build Commands

```bash
# Clean and compile
mvn clean compile

# Run tests
mvn test

# Package JAR
mvn package
```

### Dependencies

- EMF Ecore 2.35.0
- EMF Common 2.35.0
- Eclipse Core Runtime 3.31.0
- JUnit Jupiter 5.10.0 (test scope)

## Project Structure

```
src/                    # Main source (EMF-generated + custom)
generator/              # Model and Terraform generators
tests/                  # Unit and E2E tests
nlp/                    # Python NLP parser
docs/                   # Documentation
model/                  # EMF metamodel files
```

## Known Issues

1. **EMF Code Regeneration**: Java classes may be out of sync with metamodel until regeneration
2. **Test Compilation**: Tests may fail until EMF code is regenerated with new classes
3. **Package Structure**: Generator classes are in `generator` package, may need adjustment

## Next Steps

1. Regenerate EMF code from updated metamodel
2. Verify Maven build passes: `mvn clean compile`
3. Run tests: `mvn test`
4. Execute demo: `mvn exec:java -Dexec.mainClass="generator.CloudInfraGenDemo"`

